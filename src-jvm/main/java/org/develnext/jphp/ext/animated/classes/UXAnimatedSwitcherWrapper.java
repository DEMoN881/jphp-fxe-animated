package org.develnext.jphp.ext.animated.classes;

import animatefx.animation.AnimationFX;
import eu.iamgio.animated.transition.AnimatedSwitcher;
import eu.iamgio.animated.transition.AnimationPair;
import eu.iamgio.animated.transition.container.AnimatedVBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import org.develnext.jphp.ext.javafx.classes.UXParent;
import org.develnext.jphp.ext.javafx.classes.layout.UXPane; // Импортируем UXPane
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Name;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import org.develnext.jphp.ext.animated.AnimatedExtension;


@Name("UXAnimatedSwitcher")
@Namespace(AnimatedExtension.NS)
public class UXAnimatedSwitcherWrapper<T extends AnimatedSwitcher> extends UXParent<AnimatedSwitcher> {

    public UXAnimatedSwitcherWrapper(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UXAnimatedSwitcherWrapper(Environment env, ClassEntity clazz) {
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


            __wrappedObject = new AnimatedSwitcher(animationPair);


        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new IllegalArgumentException("Unknown animation type: " + enterAnimation + " or " + exitAnimation, e);
        }


    }

    @Reflection.Signature
    public void __construct(String enterAnimation, String exitAnimation, double speedIn, double speedOut, Node node) {
        try {

            Class<?> enterAnimationClass = Class.forName("animatefx.animation." + enterAnimation);
            AnimationFX enterAnim = (AnimationFX) enterAnimationClass.getDeclaredConstructor().newInstance();


            Class<?> exitAnimationClass = Class.forName("animatefx.animation." + exitAnimation);
            AnimationFX exitAnim = (AnimationFX) exitAnimationClass.getDeclaredConstructor().newInstance();


            AnimationPair animationPair = new AnimationPair(enterAnim, exitAnim).setSpeed(speedIn, speedOut);


            __wrappedObject = new AnimatedSwitcher(animationPair).of(node);


        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new IllegalArgumentException("Unknown animation type: " + enterAnimation + " or " + exitAnimation, e);
        }


    }

    @Reflection.Signature
    public void setChild(Node node)
    {
        getWrappedObject().setChild(node);
    }
}
