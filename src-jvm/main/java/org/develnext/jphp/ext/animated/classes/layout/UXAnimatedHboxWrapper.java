package org.develnext.jphp.ext.animated.classes.layout;

import animatefx.animation.FadeInUp;
import animatefx.animation.*;
import eu.iamgio.animated.transition.AnimationPair;
import eu.iamgio.animated.transition.container.AnimatedHBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import org.develnext.jphp.ext.javafx.classes.layout.UXPane; // Импортируем UXPane
import javafx.scene.layout.Priority;
import javafx.scene.layout.HBox;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Name;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import org.develnext.jphp.ext.animated.AnimatedExtension;


@Name("UXAnimatedHbox")
@Namespace(AnimatedExtension.NS + "\\layout")
public class UXAnimatedHboxWrapper<T extends AnimatedHBox> extends UXPane<AnimatedHBox> {

    interface WrappedInterface {
        @Reflection.Property
        double spacing();
        @Reflection.Property
        Pos alignment();
        @Reflection.Property
        boolean fillHeight();
    }

    public UXAnimatedHboxWrapper(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UXAnimatedHboxWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(String enterAnimation, String exitAnimation, double speedIn, double speedOut) {
        try {

            Class<?> enterAnimationClass = Class.forName("animatefx.animation." + enterAnimation);
            AnimationFX enterAnim = (AnimationFX) enterAnimationClass.getDeclaredConstructor().newInstance();


            Class<?> exitAnimationClass = Class.forName("animatefx.animation." + exitAnimation);
            AnimationFX exitAnim = (AnimationFX) exitAnimationClass.getDeclaredConstructor().newInstance();


            AnimationPair animationPair = new AnimationPair(enterAnim, exitAnim).setSpeed(speedIn, speedOut);


            __wrappedObject = new AnimatedHBox(animationPair);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new IllegalArgumentException("Unknown animation type: " + enterAnimation + " or " + exitAnimation, e);
        }
    }

    @Reflection.Signature
    public static void setHgrow(Node node, @Reflection.Nullable Priority value) {
        HBox.setHgrow(node, value);
    }

    @Reflection.Signature
    public static Priority getHgrow(Node node) {
        return HBox.getHgrow(node);
    }

    @Reflection.Signature
    public static void setMargin(Node node, Insets insets) {
        HBox.setMargin(node, insets);
    }

    
}
