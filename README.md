# fxe-animated
adds the possibility of cool and smooth animations, such as a smooth change of theme, adding, removing objects from hbox, vbox, a new swither component and more

# Class: AnimatedThemeSwitcher

## Namespace
`php\demonck\animated`

## Description
Класс `AnimatedThemeSwitcher` предоставляет метод для плавной смены темы.

## Constructor
### `__construct(UXScene $scene)`
Создает экземпляр класса.

## Methods
### `changeTheme(String $pathCss)`
Плавно сменяет тему.

#### Parameters
- `String $pathCss`: Путь к CSS файлу темы.

# Class: UXAnimatedSwitcher

## Namespace
`php\demonck\animated\layout`

## Description
Класс `UXAnimatedSwitcher` предоставляет методы для анимации переключения между элементами.

## Constructor
### `__construct(string $enterAnimation, string $exitAnimation, float $speedIn, float $speedOut)`
Создает экземпляр класса с заданными анимациями и скоростями.

#### Parameters
- `string $enterAnimation`: Анимация входа.
- `string $exitAnimation`: Анимация выхода.
- `float $speedIn`: Скорость анимации входа.
- `float $speedOut`: Скорость анимации выхода.

## Methods
### `setChild(UXNode $node)`
Устанавливает дочерний элемент для анимации.

#### Parameters
- `UXNode $node`: Узел, который будет добавлен.

# Class: UXAnimatedHbox

## Namespace
`php\demonck\animated\layout`

## Description
Класс `UXAnimatedHbox` предоставляет горизонтальную коробку с анимацией и возможностью настройки выравнивания, промежутков и заполнения высоты.

## Properties
### `alignment`
- Тип: `string`
- Описание: Варианты выравнивания: `TOP_LEFT`, `TOP_CENTER`, `TOP_RIGHT`, `CENTER_LEFT`, `CENTER`, `BOTTOM_RIGHT`, `BASELINE_LEFT`, `BASELINE_CENTER`, `BASELINE_RIGHT`.

### `spacing`
- Тип: `float`
- Описание: Промежуток между элементами.

### `fillHeight`
- Тип: `bool`
- Описание: Заполнять ли высоту. Значение по умолчанию: `true`.

## Constructor
### `__construct(array $nodes, $spacing = 0)`
Создает экземпляр класса с заданными узлами и промежутками.

#### Parameters
- `array $nodes`: Массив узлов.
- `int $spacing`: Промежуток между элементами. Значение по умолчанию: `0`.

## Methods
### `setHgrow(UXNode $node, $value)`
Устанавливает горизонтальный рост для узла.

#### Parameters
- `UXNode $node`: Узел, для которого устанавливается значение.
- `string $value`: Возможные значения: `ALWAYS`, `SOMETIMES`, `NEVER`.

### `getHgrow(UXNode $node)`
Получает значение горизонтального роста для узла.

#### Parameters
- `UXNode $node`: Узел, для которого получается значение.

### `setMargin(UXNode $node, $margins)`
Устанавливает отступы для узла.

#### Parameters
- `UXNode $node`: Узел, для которого устанавливаются отступы.
- `double[]|double $margins`: Массив отступов или одиночное значение.

# Class: AnimationProvider

## Namespace
`php\demonck\animated\animations`

## Description
Класс `AnimationProvider` предоставляет различные анимационные эффекты. Методы класса позволяют использовать различные виды анимаций.

## Methods
### `Bounce()`
Анимация подскакивания.

### `FadeIn()`
Анимация появления.

### `FadeOut()`
Анимация исчезновения.

### `Flash()`
Анимация мигания.

### `Flip()`
Анимация переворачивания.

### `Pulse()`
Анимация пульсации.

### `RollIn()`
Анимация закатывания.

### `RollOut()`
Анимация выкатывания.

### `RubberBand()`
Анимация резиновой ленты.

### `Shake()`
Анимация тряски.

### `Swing()`
Анимация раскачивания.

### `Tada()`
Анимация "тада".

### `Wobble()`
Анимация покачивания.

### `ZoomIn()`
Анимация увеличения.

### `ZoomOut()`
Анимация уменьшения.

### `RotateIn()`
Анимация вращения при входе.

### `RotateInDownLeft()`
Анимация вращения при входе сверху слева.

### `RotateInDownRight()`
Анимация вращения при входе сверху справа.

### `RotateInUpLeft()`
Анимация вращения при входе снизу слева.

### `RotateInUpRight()`
Анимация вращения при входе снизу справа.

### `RotateOut()`
Анимация вращения при выходе.

### `RotateOutDownLeft()`
Анимация вращения при выходе сверху слева.

### `RotateOutDownRight()`
Анимация вращения при выходе сверху справа.

### `RotateOutUpLeft()`
Анимация вращения при выходе снизу слева.

### `RotateOutUpRight()`
Анимация вращения при выходе снизу справа.

### `SlideInUp()`
Анимация скольжения вверх при входе.

### `SlideInDown()`
Анимация скольжения вниз при входе.

### `SlideInLeft()`
Анимация скольжения влево при входе.

### `SlideInRight()`
Анимация скольжения вправо при входе.

### `SlideOutUp()`
Анимация скольжения вверх при выходе.

### `SlideOutDown()`
Анимация скольжения вниз при выходе.

### `SlideOutLeft()`
Анимация скольжения влево при выходе.

### `SlideOutRight()`
Анимация скольжения вправо при выходе.

### `ZoomInDown()`
Анимация увеличения вниз при входе.

### `ZoomInLeft()`
Анимация увеличения влево при входе.

### `ZoomInRight()`
Анимация увеличения вправо при входе.

### `ZoomInUp()`
Анимация увеличения вверх при входе.

### `ZoomOutDown()`
Анимация уменьшения вниз при выходе.

### `ZoomOutLeft()`
Анимация уменьшения влево при выходе.

### `ZoomOutRight()`
Анимация уменьшения вправо при выходе.

### `ZoomOutUp()`
Анимация уменьшения вверх при выходе.

## Note
Если нужная анимация отсутствует, введите названия анимации, все анимации тут - https://github.com/Typhon0/AnimateFX/wiki/Animations

# Class: UXAnimatedVbox

## Namespace
`php\demonck\animated\layout`

## Description
Класс `UXAnimatedVbox` представляет вертикальную коробку с анимацией и возможностью настройки выравнивания, промежутков и заполнения ширины.

## Properties
### `alignment`
- Тип: `string`
- Описание: Варианты выравнивания: `TOP_LEFT`, `TOP_CENTER`, `TOP_RIGHT`, `CENTER_LEFT`, `CENTER`, `BOTTOM_RIGHT`, `BASELINE_LEFT`, `BASELINE_CENTER`, `BASELINE_RIGHT`.

### `spacing`
- Тип: `float`
- Описание: Промежуток между элементами.

### `fillWidth`
- Тип: `bool`
- Описание: Заполнять ли ширину. Значение по умолчанию: `true`.

## Constructor
### `__construct(string $animation, float $speedIn, float $speedOut)`
Создает экземпляр класса с заданной анимацией и скоростями.

#### Parameters
- `string $animation`: Тип анимации.
- `float $speedIn`: Скорость анимации входа.
- `float $speedOut`: Скорость анимации выхода.

## Methods
### `setVgrow(UXNode $node, string $value)`
Устанавливает вертикальный рост для узла.

#### Parameters
- `UXNode $node`: Узел, для которого устанавливается значение.
- `string $value`: Возможные значения: `ALWAYS`, `SOMETIMES`, `NEVER`.

### `getVgrow(UXNode $node)`
Получает значение вертикального роста для узла.

#### Parameters
- `UXNode $node`: Узел, для которого получается значение.

#### Returns
- `string`

### `setMargin(UXNode $node, double[]|double $margins)`
Устанавливает отступы для узла.

#### Parameters
- `UXNode $node`: Узел, для которого устанавливаются отступы.
- `double[]|double $margins`: Массив отступов или одиночное значение.
