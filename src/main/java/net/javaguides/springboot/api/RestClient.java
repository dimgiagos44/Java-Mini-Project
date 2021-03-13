package net.javaguides.springboot.api;

import java.util.Arrays;
import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class RestClient implements CommandLineRunner{
	
	private static final String GET_ALL_LOCATIONS = "http://localhost:8080/api/locations";
	private static final String GET_ALL_DEPARTMENTS = "http://localhost:8080/api/departments";
	private static final String GET_ALL_DEPARTMENTS_BY_LOC_ID = "http://localhost:8080/api/locations/{locId}";
	private static final String GET_ALL_EMPLOYEES_BY_DEP_ID = "http://localhost:8080/api/departments/{depId}";
	private static final String GET_EMPLOYEE_BY_EMP_ID = "http://localhost:8080/api/employees/{empId}";
	static RestTemplate restTemplate = new RestTemplate();
	
	public static void main(String[] args) {
		callGetAllLocationsApi();
		callGetAllDepartmentsApi();
		callGetAllDepartmentsByLocIdApi();
		callGetAllEmployeesByDepIdApi();
		callGetEmployeeByEmpIdApi();
	}
	
	private static void callGetAllLocationsApi() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<List> entity = new HttpEntity<List>(headers);
		ResponseEntity<List> result = restTemplate.exchange(GET_ALL_LOCATIONS, HttpMethod.GET, entity, List.class);
		
		System.out.println(result.getBody());
	}
	
	private static void callGetAllDepartmentsApi() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<List> entity = new HttpEntity<List>(headers);
		ResponseEntity<List> result = restTemplate.exchange(GET_ALL_DEPARTMENTS, HttpMethod.GET, entity, List.class);
		System.out.println(result.getBody());
	}
	
	private static void callGetAllDepartmentsByLocIdApi() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<List> entity = new HttpEntity<List>(headers);
		ResponseEntity<List> result = restTemplate.exchange(GET_ALL_DEPARTMENTS_BY_LOC_ID, HttpMethod.GET, entity, List.class, 1);
		System.out.println(result.getBody());
	}
	
	private static void callGetAllEmployeesByDepIdApi() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<List> entity = new HttpEntity<List>(headers);
		ResponseEntity<List> result = restTemplate.exchange(GET_ALL_EMPLOYEES_BY_DEP_ID, HttpMethod.GET, entity, List.class, 1);
		System.out.println(result.getBody());
	}
	
	private static void callGetEmployeeByEmpIdApi() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<List> entity = new HttpEntity<List>(headers);
		ResponseEntity<List> result = restTemplate.exchange(GET_EMPLOYEE_BY_EMP_ID, HttpMethod.GET, entity, List.class, 2);
		System.out.println(result.getBody());
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
		
		
	

}
