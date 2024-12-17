package org.example.donationms.Controller;

import org.example.donationms.Entity.Donation;
import org.example.donationms.Services.DonationServicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donation")
public class DonationController {
    @Autowired
    DonationServicesImplement donationService;
    @RequestMapping("/all")
    public List<Donation> getAllDonations() {
        return donationService.getDonations();
    }
    @RequestMapping("/{id}")
    public Optional<Donation> getDonation(@PathVariable long id){
        return donationService.getDonation(id);
    }
    @RequestMapping("/delete/{id}")
    public void deleteDonation(@PathVariable long id){
        donationService.removeDonation(id);
    }
    @PostMapping("/Create")
    public Donation CreateDonation(@RequestBody Donation d){
        return donationService.addDonation(d);
    }
    @PostMapping("/Update/{id}")
    public Donation UpdateUser(@PathVariable long id, @RequestBody Donation d){
        return donationService.updateDonation(d);
    }


}

