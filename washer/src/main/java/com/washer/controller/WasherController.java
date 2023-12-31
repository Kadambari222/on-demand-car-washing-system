package com.washer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.washer.model.OrderDetails;
import com.washer.model.WashPacks;
import com.washer.service.WasherService;

import java.util.List;

/** This Controller has two permanent washers that should not be deleted
 * -> WasherDetails(joel@gmail.com,"Joel","joel123")
 * -> WasherDetails(kenny@gmail.com,"Kenny","kenny345")
 * -> WasherDetails(james@gmail.com,"James","james987")
 * Both will be used to test wrapper classes for washer and rating integration */


@RestController
@RequestMapping("/washers")
public class WasherController {
    @Autowired
    WasherService wr;

    /** Only the methods that consume rest template are below this comment **/
    //To see the Unassigned orders
    @GetMapping("/findUnassigned")
    public List<OrderDetails> getUnassignedOrders(){
        return wr.getUnassignedOrders();
    }
    //The status of the order can be either pending or completed
    @PutMapping("/updateStatus")
    public OrderDetails updateStatusoftheOrder(@RequestBody OrderDetails orderDetails){
        return wr.updateStatus(orderDetails);
    }
    //To assign a washer to the order by washer
    @PutMapping("/assign")
    public OrderDetails assignSelf(@RequestBody OrderDetails orderDetails){
        return wr.assignSelf(orderDetails);
    }
    //To see all the wash packs
    @GetMapping("/seeWP")
    public List<WashPacks> getAllWP(){
        return wr.getAllWP();
    }
}
