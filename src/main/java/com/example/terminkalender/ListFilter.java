package com.example.terminkalender;


import java.util.ArrayList;
import java.util.List;

public class ListFilter {

        public List<String> filterList(List<String> inputList, String searchTerm) {
            List<String> filteredList = new ArrayList<>();

            for (String item : inputList) {
                if (item.contains(searchTerm)) {
                    filteredList.add(item);
                }
            }

            return filteredList;
        }
    private List<String> originalList = new ArrayList<>();
    private List<String> filteredList = new ArrayList<>();
    private String searchTerm = "";

    // ...

    public void filterList() {
        filteredList = filterList(originalList, searchTerm);
    }

    public List<String> FilteredList(List<String> inputList, String searchTerm) {
        List<String> filteredList = new ArrayList<>();

        for (String item : inputList) {
            if (item.contains(searchTerm)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    }

