package org.example.donationms.Repository;

import org.example.donationms.Entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepo extends JpaRepository<Donation,Long> {
}
