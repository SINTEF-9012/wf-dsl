/*
 * generated by Xtext 2.21.0
 */
package workflow.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import workflow.WfDslRuntimeModule;
import workflow.WfDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class WfDslIdeSetup extends WfDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new WfDslRuntimeModule(), new WfDslIdeModule()));
	}
	
}