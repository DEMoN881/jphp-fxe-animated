package org.develnext.jphp.ext.animated.classes.animations;

import org.develnext.jphp.ext.animated.AnimatedExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;


@Reflection.Name("AnimationProvider")
@Reflection.Namespace(AnimatedExtension.NS + "\\animations")
public class AnimationProviderWrapper extends BaseObject {

    public AnimationProviderWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    @Reflection.Signature
    public static String Bounce() {
        return "Bounce";
    }

    @Reflection.Signature
    public static String FadeIn() {
        return "FadeIn";
    }

    @Reflection.Signature
    public static String FadeOut() {
        return "FadeOut";
    }

    @Reflection.Signature
    public static String Flash() {
        return "Flash";
    }

    @Reflection.Signature
    public static String Flip() {
        return "Flip";
    }

    @Reflection.Signature
    public static String Pulse() {
        return "Pulse";
    }

    @Reflection.Signature
    public static String RollIn() {
        return "RollIn";
    }

    @Reflection.Signature
    public static String RollOut() {
        return "RollOut";
    }

    @Reflection.Signature
    public static String RubberBand() {
        return "RubberBand";
    }

    @Reflection.Signature
    public static String Shake() {
        return "Shake";
    }

    @Reflection.Signature
    public static String Swing() {
        return "Swing";
    }

    @Reflection.Signature
    public static String Tada() {
        return "Tada";
    }

    @Reflection.Signature
    public static String Wobble() {
        return "Wobble";
    }

    @Reflection.Signature
    public static String ZoomIn() {
        return "ZoomIn";
    }

    @Reflection.Signature
    public static String ZoomOut() {
        return "ZoomOut";
    }

    // Трансформации
    @Reflection.Signature
    public static String RotateIn() {
        return "RotateIn";
    }

    @Reflection.Signature
    public static String RotateInDownLeft() {
        return "RotateInDownLeft";
    }

    @Reflection.Signature
    public static String RotateInDownRight() {
        return "RotateInDownRight";
    }

    @Reflection.Signature
    public static String RotateInUpLeft() {
        return "RotateInUpLeft";
    }

    @Reflection.Signature
    public static String RotateInUpRight() {
        return "RotateInUpRight";
    }

    @Reflection.Signature
    public static String RotateOut() {
        return "RotateOut";
    }

    @Reflection.Signature
    public static String RotateOutDownLeft() {
        return "RotateOutDownLeft";
    }

    @Reflection.Signature
    public static String RotateOutDownRight() {
        return "RotateOutDownRight";
    }

    @Reflection.Signature
    public static String RotateOutUpLeft() {
        return "RotateOutUpLeft";
    }

    @Reflection.Signature
    public static String RotateOutUpRight() {
        return "RotateOutUpRight";
    }

    @Reflection.Signature
    public static String SlideInUp() {
        return "SlideInUp";
    }

    @Reflection.Signature
    public static String SlideInDown() {
        return "SlideInDown";
    }

    @Reflection.Signature
    public static String SlideInLeft() {
        return "SlideInLeft";
    }

    @Reflection.Signature
    public static String SlideInRight() {
        return "SlideInRight";
    }

    @Reflection.Signature
    public static String SlideOutUp() {
        return "SlideOutUp";
    }

    @Reflection.Signature
    public static String SlideOutDown() {
        return "SlideOutDown";
    }

    @Reflection.Signature
    public static String SlideOutLeft() {
        return "SlideOutLeft";
    }

    @Reflection.Signature
    public static String SlideOutRight() {
        return "SlideOutRight";
    }

    @Reflection.Signature
    public static String ZoomInDown() {
        return "ZoomInDown";
    }

    @Reflection.Signature
    public static String ZoomInLeft() {
        return "ZoomInLeft";
    }

    @Reflection.Signature
    public static String ZoomInRight() {
        return "ZoomInRight";
    }

    @Reflection.Signature
    public static String ZoomInUp() {
        return "ZoomInUp";
    }

    @Reflection.Signature
    public static String ZoomOutDown() {
        return "ZoomOutDown";
    }

    @Reflection.Signature
    public static String ZoomOutLeft() {
        return "ZoomOutLeft";
    }

    @Reflection.Signature
    public static String ZoomOutRight() {
        return "ZoomOutRight";
    }

    @Reflection.Signature
    public static String ZoomOutUp() {
        return "ZoomOutUp";
    }

}
