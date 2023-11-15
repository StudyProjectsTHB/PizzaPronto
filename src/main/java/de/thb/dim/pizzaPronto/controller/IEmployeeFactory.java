package de.thb.dim.pizzaPronto.controller;

import de.thb.dim.pizzaPronto.businessObjects.IService;
import de.thb.dim.pizzaPronto.valueObjects.EmployeeVO;

public interface IEmployeeFactory {
	
	/**
	 * creates an ChefVO if the service is kitchen or a DeliveryManVO if the service is delivery
	 * @param pNo
	 * @param lastName
	 * @param firstName
	 * @param service
	 * @return
	 * @throws IllegalArgumentException with the message "Wrong service." if service is not correct
	 */
	public abstract EmployeeVO create(String pNo, String lastName, String firstName, IService service) throws IllegalArgumentException;
}
