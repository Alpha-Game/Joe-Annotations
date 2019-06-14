package joe.annotations.inheritance;

import java.lang.reflect.Method;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes({"joe.annotations.inheritance.Inherit"})
public class InheritProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnvironment) {
		Messager messager = processingEnv.getMessager();
		for (TypeElement te : annotations) {
			for (Element e : roundEnvironment.getElementsAnnotatedWith(te)) {
				messager.printMessage(Kind.ERROR, "Printing: " + e.toString());
			}
			Method m;
			m.getClass().
		}
		return true;
	}

}

 
