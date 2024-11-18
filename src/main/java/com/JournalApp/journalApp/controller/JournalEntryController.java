package com.JournalApp.journalApp.controller;

import com.JournalApp.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    List<JournalEntry> journal = new ArrayList<>();

    @GetMapping
    public List<JournalEntry> getAll(){
       return new ArrayList<>(journal);

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry){
        journal.add(entry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getDataById(@PathVariable int myId){
        return journal.get(myId);
    }
}
