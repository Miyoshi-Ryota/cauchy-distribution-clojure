# cauchy-distribution

A Clojure library designed to sample from a cauchy distribution.

A below figure is plotting data sampled by this library.
![Figure_1](https://user-images.githubusercontent.com/23313273/92418222-5bc6b800-f1a1-11ea-8093-833542f83ed5.png)

## Usage

* Add :dependencies in your project.clj file.
    ```
    [mrcsce/cauchy-distribution "0.1.0"]
    ```
* Add :require in your clj file to import the library.
* Use a function `sample-cauchy-distribution` like a below.
```clojure
(ns your-project.core
  (:require [cauchy-distribution.core :as c]))

;; parameter-of-location is usually written as x_0 in math formula.
(def parameter-of-location -2)
 
;; parameter-of-scale is usually written as gamma in math formula. 
(def parameter-of-scale 0.5)

(c/sample-cauchy-distribution parameter-of-location parameter-of-scale)
;; => -2.2589638594699033
```

## License

MIT License

Copyright 2020 Ryota Miyoshi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

