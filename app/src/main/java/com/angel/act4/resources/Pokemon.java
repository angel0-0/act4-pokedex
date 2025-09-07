package com.angel.act4.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Pokemon {
           @SerializedName("name")
        @Expose
        private String name;

        @SerializedName("url")
        @Expose
        private String url;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDescription() { return "It's " + getName() + "!"; }
}
