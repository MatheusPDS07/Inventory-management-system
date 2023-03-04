package com.example.demo.controller;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/sendData")
public class DataController {

    @Autowired
    protected Firestore firestore;

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Map<String, String> data) {
        //firestore.collection("data").add(data);
        firestore.collection("data").document(data.get("string1")).set(data);
        return ResponseEntity.ok("Dados enviados com sucesso!");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteData(@RequestParam String id) {
        //System.out.println("Excluindo o documento com o ID: " + id);
        DocumentReference document = firestore.collection("data").document(id);
        document.delete();
        return ResponseEntity.ok("Dados excluídos com sucesso!");
    }

    @PutMapping
    public ResponseEntity<String> updateData(@RequestBody Map<String, Object> data) {
        DocumentReference document = firestore.collection("data").document((String) data.get("string1"));
        document.update(data);
        return ResponseEntity.ok("Dados atualizados com sucesso!");
    }

}
