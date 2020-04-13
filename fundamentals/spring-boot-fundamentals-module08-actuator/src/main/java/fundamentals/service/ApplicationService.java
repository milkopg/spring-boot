package fundamentals.service;

import java.util.List;

import fundamentals.entity.Application;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


