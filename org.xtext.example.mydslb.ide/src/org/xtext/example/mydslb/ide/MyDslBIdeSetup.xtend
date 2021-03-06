/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydslb.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydslb.MyDslBRuntimeModule
import org.xtext.example.mydslb.MyDslBStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyDslBIdeSetup extends MyDslBStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyDslBRuntimeModule, new MyDslBIdeModule))
	}
	
}
