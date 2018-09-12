package test.swipejobs.JobMatcher.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Job {

    Boolean driverLicenseRequired;
    String[] requiredCertificates;
    Location location;
    String billRate;
    Integer workersRequired;
    String startDate;
    String about;
    String jobTitle;
    String company;
    String guid;
    Integer jobId;

    
    public Boolean getDriverLicenseRequired() {
		return driverLicenseRequired;
	}

	public void setDriverLicenseRequired(Boolean driverLicenseRequired) {
		this.driverLicenseRequired = driverLicenseRequired;
	}

	public boolean isDriverLicenseRequired() {
        return driverLicenseRequired;
    }

    public void setDriverLicenseRequired(boolean driverLicenseRequired) {
        this.driverLicenseRequired = driverLicenseRequired;
    }

    public String[] getRequiredCertificates() {
        return requiredCertificates;
    }

    public void setRequiredCertificates(String[] requiredCertificates) {
        this.requiredCertificates = requiredCertificates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getBillRate() {
        return billRate;
    }

    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public Integer getWorkersRequired() {
        return workersRequired;
    }

    public void setWorkersRequired(Integer workersRequired) {
        this.workersRequired = workersRequired;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
}
