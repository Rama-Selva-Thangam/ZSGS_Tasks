package com.ramaselvathangamm.evaluation4.performoperations;

import java.util.List;

import com.ramaselvathangamm.evaluation4.repository.Repository;

class PerformOperationsViewModel {
	private PerformOperationsView performOperationsView;

	PerformOperationsViewModel(PerformOperationsView performOperationsView) {
		this.performOperationsView = performOperationsView;
	}

	int createRootRole(String rootName) {
		if (rootName.toUpperCase().equals("CEO")) {
			Repository.getInstance().addRoot(rootName);
			return 0;
		} else {
			return 1;
		}
	}

	int addSubRole(String subRoleName, String reportingRoleName) {
		return Repository.getInstance().addSubRole(subRoleName, reportingRoleName);
	}

	List<String> displayRole() {
		return Repository.getInstance().displayRoles();
	}

}