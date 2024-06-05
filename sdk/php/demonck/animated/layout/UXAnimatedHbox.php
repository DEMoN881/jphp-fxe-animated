<?php

namespace php\demonck\animated\layout;


use php\gui\UXNode;
use php\gui\layout\UXPane;
/**
 * Class UXHBox
 * @package php\gui\layout
 * @packages gui, javafx
 */
class UXAnimatedHbox extends UXPane
{
   /**
     * TOP_LEFT, TOP_CENTER, TOP_RIGHT, CENTER_LEFT, ... CENTER, ... BOTTOM_RIGHT,
     * BASELINE_LEFT, BASELINE_CENTER, BASELINE_RIGHT
     * @var string
     */
    public $alignment;

    /**
     * @var float
     */
    public $spacing;

    /**
     * @var bool
     */
    public $fillHeight = true;

    /**
     * @param UXNode[] $nodes [optional]
     * @param int $spacing
     */
    public function __construct(array $nodes, $spacing = 0)
    {
    }

    /**
     * @param UXNode $node
     * @param string $value ALWAYS, SOMETIMES, NEVER
     */
    static function setHgrow(UXNode $node, $value)
    {
    }

    static function getHgrow(UXNode $node)
    {
    }

    /**
     * @param UXNode $node
     * @param double[]|double $margins
     */
    static public function setMargin(UXNode $node, $margins)
    {
    }
}


?>