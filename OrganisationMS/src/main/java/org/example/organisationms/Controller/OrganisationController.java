package org.example.organisationms.Controller;

import org.example.organisationms.Entity.Organisation;
import org.example.organisationms.Services.OrganisationServicesImpleme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/organisation")
public class OrganisationController {
    @Autowired
    OrganisationServicesImpleme OR;
    @RequestMapping("/all")
    public List<Organisation> all(){
       return OR.GetAllOrganisations();
    }
    @RequestMapping("/{id}")
    public Optional<Organisation> getOrganisation(@PathVariable long id){
        return OR.GetOrganisation(id);
    }
    @RequestMapping("/delete/{id}")
    public void deleteOrganisation (@PathVariable long id){
        OR.DeleteOrganisation(id);
    }
    @PostMapping("/Create")
    public Organisation CreateOrginations(@RequestBody Organisation org){
        return OR.CreateOrg(org);
    }
    @PostMapping("/Update/{id}")
    public Organisation UpdateUser(@PathVariable long id, @RequestBody Organisation org){
        return OR.UpdateOrganisation(org);
    }
}
