package org.example.organisationms.Services;

import org.example.organisationms.Entity.Organisation;
import org.example.organisationms.Repository.OrganisationRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrganisationServicesImpleme implements OrganisationServices {
    @Autowired
    OrganisationRepos OR;
    @Override
    public Organisation CreateOrg(Organisation organisation) {
        return OR.save(organisation);
    }

    @Override
    public Optional<Organisation> GetOrganisation(long id) {
        return OR.findById(id);
    }

    @Override
    public List<Organisation> GetAllOrganisations() {
        return OR.findAll();
    }

    @Override
    public Organisation UpdateOrganisation(Organisation organisation) {
        return OR.save(organisation);
    }

    @Override
    public void DeleteOrganisation(long id) {
        OR.deleteById(id);
    }
}
