package com.project.smaker.controller;

import com.project.smaker.model.dto.DetailDTO;
import com.project.smaker.service.detail.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_detail")
public class DetailController {
    @Autowired
    DetailService detailService;

    @GetMapping
    public ResponseEntity<List<DetailDTO>> getOrders() {
        return new ResponseEntity(detailService.getDetails(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailDTO> getOrder(@PathVariable("id") int detailId) {
        return new ResponseEntity(detailService.getDetail(detailId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DetailDTO> postOrder(@RequestBody DetailDTO DetailDTO) {
        return new ResponseEntity(detailService.postDetail(DetailDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailDTO> putOrder(@PathVariable("id") int detailId, DetailDTO DetailDTO) {
        return new ResponseEntity(detailService.putDetail(detailId, DetailDTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailDTO> deleteOrder(@PathVariable("id") int detailId) {
        detailService.deleteDetail(detailId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
