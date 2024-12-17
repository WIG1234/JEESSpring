package org.example.donationms.Services;

import org.example.donationms.Entity.Donation;
import org.example.donationms.Repository.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DonationServicesImplement implements DonationServices {
    @Autowired
    DonationRepo DR;

    @Override
    public Donation addDonation(Donation d) {

        return DR.save(d);
    }

    @Override
    public void removeDonation(long id) {
     DR.deleteById(id);
    }

    @Override
    public List<Donation> getDonations() {
        return DR.findAll();
    }

    @Override
    public Optional<Donation> getDonation(long id) {
        return DR.findById(id);
    }

    @Override
    public Donation updateDonation(Donation d) {
     return DR.save(d);
    }
}
