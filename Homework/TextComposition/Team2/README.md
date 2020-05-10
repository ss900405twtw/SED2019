# SEDHW_1105
## Requirements Statement
* The Composition class maintains a collection of Component instances, which
represent text and graphical elements in a document.
* A composition arranges component objects into lines using a linebreaking
strategy.
* Each component has an associated natural size, stretchability, and
shrinkability
* The stretchability defines how much the component can grow beyond its
natural size; shrinkability is how much it can shrink
* When a new layout is required, the composition calls its compose method to
determine where to place linebreaks
* There are 3 different algorithms for breaking lines:
    * Simple Composition: A simple strategy that determines line breaks one at a time
    * Tex Composition: This strategy tries to optimize line breaks globally, that is, one paragraph at a time.
    * Array Composition: A strategy that selects breaks so that each row has a fixed number of items. It's useful for breaking a collection of icons into rows, for example