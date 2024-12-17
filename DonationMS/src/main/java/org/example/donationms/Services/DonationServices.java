package org.example.donationms.Services;

import org.example.donationms.Entity.Donation;

import java.util.List;
import java.util.Optional;

public interface DonationServices {
    public Donation addDonation(Donation d);
    public void removeDonation(long id);
    public List<Donation> getDonations();
    public Optional<Donation> getDonation(long id);
    public Donation updateDonation(Donation d);
}
