package in.ashokit.planReport.service;

import java.util.List;

import in.ashokit.planReport.entities.PlanReports;

public interface ReportService {
	
	public List<PlanReports> getreportbyplanname(String planname);
	
	public List<PlanReports> getreportbyplanstatus(String planStatus);
	

}
