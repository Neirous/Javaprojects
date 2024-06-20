package com.neirous.project.collection.homework.homework2;

import java.util.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        New[] news = new New[2];
        news[0] = new New("new 1");
        news[1] = new New("new 2");
        news[0].setContent("Cor kill many people asdfadfd sdfasd");
        news[1].setContent("boy remember fish asdfasdf adsfasd ");

        ArrayList arrayList = new ArrayList();
        arrayList.add(news[0]);
        arrayList.add(news[1]);
        Collections.reverse(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            ((New)arrayList.get(i)).setContent(processContent(((New)arrayList.get(i)).getContent()));
        }
        System.out.println(arrayList);
    }

    public static String processContent(String content){
        if(content.length()>15){
            return content.substring(0,15) + "...";
        }
        else if(content == null)
            return "";
        else return content;
    }
}

class New {


    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public New(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "New{" +
                "content='" + content + '\'' +
                '}';
    }
}
