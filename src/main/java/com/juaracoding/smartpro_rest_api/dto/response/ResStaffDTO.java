package com.juaracoding.smartpro_rest_api.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juaracoding.smartpro_rest_api.dto.relation.RelDivisionDTO;
import com.juaracoding.smartpro_rest_api.dto.relation.RelRoleDTO;

/***
 * Author : Reynaldi
 * Created date : 2025-06-10
 * Edited by : Michael
 * Edited date : 2025-06-17
 */

public class ResStaffDTO {

    private Long id;

    @JsonProperty("full-name")
    private String fullName;

    @JsonProperty("phone-number")
    private String phoneNumber;

    private String username;

    private String password;

    private String photoProfileUrl;

    private RelDivisionDTO division;

    private RelRoleDTO role;

    public String getPhotoProfileUrl() {
        return photoProfileUrl;
    }

    public void setPhotoProfileUrl(String photoProfileUrl) {
        this.photoProfileUrl = photoProfileUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RelDivisionDTO getDivision() {
        return division;
    }

    public void setDivision(RelDivisionDTO division) {
        this.division = division;
    }

    public RelRoleDTO getRole() {
        return role;
    }

    public void setRole(RelRoleDTO role) {
        this.role = role;
    }
}
