package org.cryptomator.domain.usecases.vault;

import org.cryptomator.domain.Vault;
import org.cryptomator.domain.exception.BackendException;
import org.cryptomator.domain.repository.VaultRepository;
import org.cryptomator.generator.Parameter;
import org.cryptomator.generator.UseCase;

@UseCase
class ReloadVault {

	private final VaultRepository vaultRepository;
	private final Vault vault;

	public ReloadVault(VaultRepository vaultRepository, @Parameter Vault vault) {
		this.vaultRepository = vaultRepository;
		this.vault = vault;
	}

	public Vault execute() throws BackendException {
		return vaultRepository.load(vault.getId());
	}

}
