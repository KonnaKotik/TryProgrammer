package com.konna.testhistory.objects;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by emil1101 on 12.12.17.
 * TestHistory
 */

public class Questions {

    String age;

    Context context;

    JsonParser jsonParser;
    JsonArray data;

    public Questions(Context context, String age) {
        this.age = age;
        this.context = context;

        jsonParser = new JsonParser();

        String text = getStringFromFile(context, "questions.json");

        data = jsonParser.parse(text).getAsJsonObject().get(age).getAsJsonArray();
    }

    public int getCount() {
        return data.size();
    }

    public String getQuestion(int index) {
        return data.get(index).getAsJsonObject().get("question").getAsString();
    }

    public ArrayList<String> getAnswers(int index) {
        JsonArray answers = data.get(index).getAsJsonObject().get("answers").getAsJsonArray();

        ArrayList<String> list = new ArrayList<String>() {};

        for (int i = 0; i < answers.size(); i++) {
            list.add(answers.get(i).getAsString());
        }

        return list;
    }

    public static String getStringFromFile(Context context, String filename) {
        try {
            InputStream inputStream = context.getAssets().open(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            List<String> lines = new LinkedList<>();
            String line = bufferedReader.readLine();
            while(line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
            String separator = System.getProperty("line.separator");
            String contents = TextUtils.join(separator, lines);
            return contents;
        } catch(IOException e) {
            return "{}";
        }
    }

}
