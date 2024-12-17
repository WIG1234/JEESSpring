package org.example.organisationms.Services;

import org.example.organisationms.Entity.Organisation;

import java.util.List;
import java.util.Optional;

public interface OrganisationServices {
    public Organisation CreateOrg(Organisation organisation);
    public Optional<Organisation> GetOrganisation(long id);
    public List<Organisation> GetAllOrganisations();
    public Organisation UpdateOrganisation(Organisation organisation);
    public void DeleteOrganisation(long id);
}
