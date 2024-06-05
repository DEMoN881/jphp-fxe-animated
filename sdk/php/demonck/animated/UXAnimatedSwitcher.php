<?php

namespace php\demonck\animated\layout;


use php\gui\UXNode;
use php\gui\UXParent;
/**
 * Class UXHBox
 * @package php\gui\layout
 * @packages gui, javafx
 */
class UXAnimatedSwitcher extends UXParent
{

    /**
     * @param string inAnimation
     * @param string outAnimation
     * @param int $spacing
     */
    public function __construct(string $enterAnimation, string $exitAnimation, float $speedIn, float $speedOut)
    {
    }

    /**
     * @param UXNode $node
     */
     public function setChild(UXNode $node)
    {
    }
}


?>