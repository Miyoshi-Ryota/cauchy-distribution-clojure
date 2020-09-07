(ns cauchy-distribution.core)

(defn sample-cauchy-distribution
  "`parameter-of-location` is usually written as x_0 in math formula.
  `parameter-of-scale` is usually written as gamma in math formula"
  [parameter-of-location parameter-of-scale]
  (+ parameter-of-location
     (* parameter-of-scale
        (Math/tan
          (* Math/PI
             (- (rand) 0.5))))))
