package org.develnext.jphp.ext.animated.classes;
import eu.iamgio.animated.transition.AnimatedThemeSwitcher;

import eu.iamgio.animated.transition.animations.clip.CircleClipOut;
import javafx.scene.Scene;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Name;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;
import org.develnext.jphp.ext.animated.AnimatedExtension;

@Name("AnimatedThemeSwitcher")
@Namespace(AnimatedExtension.NS)
public class AnimatedThemeSwitcherWrapper extends BaseObject {

    public AnimatedThemeSwitcherWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    private Scene scene;
    private AnimatedThemeSwitcher animatedThemeSwitcher;

    @Reflection.Signature
    public void __construct(Scene scene) {

        this.scene = scene;
        animatedThemeSwitcher = new AnimatedThemeSwitcher(scene, new CircleClipOut());
        animatedThemeSwitcher.init();

    }

    @Reflection.Signature
    public void changeTheme(String pathCss) {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(pathCss);
    }


}
