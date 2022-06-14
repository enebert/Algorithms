I began with a handful of problems regarding the Fibonacci sequence defined in the following way:

$$
f_n = \begin{cases}
  0 &\text{ if } n = 0 \\
  1 &\text{ if } n = 1  \\
  f_{n-1} + f_{n-2} &\text{ otherwise} \\
\end{cases}
$$

Let $\phi = \frac{1+\sqrt{5}}{2}$ and $\hat{\phi} = \frac{1-\sqrt{5}}{2}$ its real conjugate. Here are some basic notions, in no particular order:

1. By direct computation, $\phi \hat{\phi} = -1$ and therefore $-\phi = \tfrac{1}{\hat{\phi}}$. A similar relation can be obtained for $-\hat{\phi}$.
2. Via the quadratic equation, $\phi$ and $\hat{\phi}$ are the two distinct real roots of the polynomial $z^2 - z -1$.
3. The above implies that $\phi^2 = \phi+1$.
