package org.example.organisationms.Repository;

import org.example.organisationms.Entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepos extends JpaRepository<Organisation, Long> {
}
