package dully;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;

import com.google.inject.Injector;

public class XcoreStandaloneSetup2 extends XcoreStandaloneSetup {
	
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		try {
			EcorePlugin.getPlatformResourceMap().put("org.xtext.example.mydsl.axcoremetamodel", URI.createFileURI(new File("../org.xtext.example.mydsl.axcoremetamodel/.project").getCanonicalPath()));
			EcorePlugin.getPlatformResourceMap().put("org.xtext.example.mydsl.axcoremetamodel.edit", URI.createFileURI(new File("../org.xtext.example.mydsl.axcoremetamodel.edit/.project").getCanonicalPath()));
			EcorePlugin.getPlatformResourceMap().put("org.xtext.example.mydsl.axcoremetamodel.editor", URI.createFileURI(new File("../org.xtext.example.mydsl.axcoremetamodel.editor/.project").getCanonicalPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.createInjectorAndDoEMFRegistration();
	}
	

}
