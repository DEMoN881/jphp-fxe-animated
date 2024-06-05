package org.develnext.jphp.ext.animated;

import eu.iamgio.animated.transition.AnimatedSwitcher;
import eu.iamgio.animated.transition.container.AnimatedHBox;
import eu.iamgio.animated.transition.container.AnimatedVBox;
import org.develnext.jphp.ext.animated.classes.AnimatedThemeSwitcherWrapper;
import org.develnext.jphp.ext.animated.classes.UXAnimatedSwitcherWrapper;
import org.develnext.jphp.ext.animated.classes.layout.UXAnimatedHboxWrapper;
import org.develnext.jphp.ext.animated.classes.layout.UXAnimatedVboxWrapper;
import org.develnext.jphp.ext.animated.classes.animations.AnimationProviderWrapper;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;


public class AnimatedExtension extends Extension
{
    public static final String NS = "php\\demonck\\animated";

    @Override
    public Status getStatus()
    {
        return Status.BETA;
    }
    @Override
    public void onRegister(CompileScope scope)
    {
     registerClass(scope,AnimatedThemeSwitcherWrapper.class);
     registerWrapperClass(scope, AnimatedVBox.class, UXAnimatedVboxWrapper.class);
     registerWrapperClass(scope, AnimatedHBox.class, UXAnimatedHboxWrapper.class);
     registerWrapperClass(scope, AnimatedSwitcher.class, UXAnimatedSwitcherWrapper.class);
     registerClass(scope, AnimationProviderWrapper.class);


    }
}
