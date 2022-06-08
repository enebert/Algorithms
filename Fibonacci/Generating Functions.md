1. Define the generating function

$$
\begin{align*}
\matscr{F}(z):=& \sum_{i=0}^{\infty} F_i z^i \\
              =& 0 + z + z^2 + 2z^3 + 3z^4 + 5z^5 + 8z^6 + \cdots\\
\end{align*}
$$
where the coefficient $F_i$ is the $i^{\text{th}}$ Fibonacci number.

**Claim:** $\mathscr{F}(z) = z+z\mathscr{F}(z) + z^2\mathscr{F}(z)$

*Proof.*

We use the definition of the Fibonacci sequence and our ability to reindex sums:

$$
\begin{align*}
    \mathscr{F}(z) &= \sum_{i=0}^{infty} F_iz^i \\
                   &= 0 + z + \sum_{i=2}^{\infty} (F_{i-1} + F_{i-2})z^i \\
                   &= z + \sum_{i=2}^{\infty} F_{i-1} z^i + \sum_{i=2}^{\infty} F_{i-2}z^i \\
                   &= z + \sum_{i=0}F_iz^{i+1} + \sum_{i=0}^{\infty} F_i z^{i+2} \\
                   &= z + z\sum_{i=0}F_iz^i + z^2\sum_{i=0}F_iz^i \\
                   &= z + z\mathscr{F}(z) + z^2 \mathscr{F}(z) \\
\end{align*}
$$

which proves the claim.

2. We will prove the following relations between the generating function above and the rationality in terms of the golden ratio:

$$
\begin{align*}
    \mathscr{F}(z) &= \frac{1}{1-z-z^2} \\
                   &= \frac{z}{(1-\phi z)(1-\hat{\phi}z)} \\
                   &= \frac{1}{\sqrt{5}} \left( \frac{1}{1-\phi z} - \frac{1}{1-\hat{\phi} z} \right) \\
\end{align*}
$$

The first equality is obtained by rearranging the relation we obtained for the generating function above:

$$
\begin{align*}
\mathscr{F}(z) &= z+z\mathsccr{F}(z) + z^2\mathscr{F}(z) \\
\mathscr{F}(z) -z \mathscr{F}(z) - z^2 \mathscr{F}(z) &= z \\
\mathscr{F}(z)(1-z-z^2) &= z \\
\mathscr{F}(z) = \frac{z}{1-z-z^2} \\
\end{align*}
$$

The second equality is a result using the fact that $\phi \hat{\phi} = -1$:

$$
\begin{align*}
\frac{z}{1-z-z^2} &= \frac{z}{(z+\phi)(z+\hat{\phi})} \\
                  &= - \frac{z}{\phi \hat{\phi} +(\phi + \hat{\phi})z - z^2} \\
                  &= \frac{z}{1 - (\phi + \hat{\phi})z + \phi \hat{\phi}z^2} \\
                  &= \frac{z}{(1-\phi z)(1-\hat{\phi}z)} \\
\end{align*}
$$

The last equality is a direct computation of the fraction above into partial fractions.

3. We show that

$$
\mathscr{F}(z) = \sum_{i=0}^{\infty} \frac{1}{\sqrt{5}} (\phi^i - \hat{\phi}^i)z^i
$$

The proof of this fact use the usual representation for a geometric series as a generating function:

$$
\begin{align*}
    \mathscr{F}(z) &= \frac{1}{\sqrt{5}} \left( \frac{1}{1-\phi z} - \frac{1}{1-\hat{\phi}} z \right) \\
                   &= \frac{1}{\sqrt{5}} \left( \sum_{i=0}^{\infty} (\phi z)^i - \sum_{i=0}^{\infty} (\hat{\phi}z)^i \right) \\
                   &= \frac{1}{\sqrt{5}} \sum_{i=0}{\infty} (\phi^i - \hat{\phi}^i)z^i \\
\end{align*}
$$

4. We use this fact to show that

$$
    F_i = \frac{1}{\sqrt{5}} \phi^i \text{ for } i > 0.
$$

*Proof.*

Notice that $\vert \hat{\phi} \vert < 1$, which gives us the following bound:

$$
\frac{\vert \hat{\phi} \vert^i}{\sqrt{5}} < \frac{1}{\sqrt{5}} < \frac{1}{2}
$$

and therefore

$$
F_i = \frac{\phi^i - \hat{\phi}^i}{\sqrt{5}} \leq \frac{\phi^i}{\sqrt{5}} + \frac{1}{2}
$$

One now has the desired result  because $F_i = \lfloor \frac{\phi^i}{\sqrt{5}} + \frac{1}{2} \rfloor$ is equivalent to rounding $\frac{\phi^i}{\sqrt{5}}$ to the nearest integer.

5. We finish by proving a well-known result: that the Fibonacci sequence grows exponetially in $phi$:

$$
F_{i+2} \geq \phi^i \text{ for } i \geq 0.
$$

*Proof.*

We proceed by strong induction.

**Base Case:** Notice that $F_2 \geq 1$ by definition and a direct computation yields $F_3 = 2$ and $\phi^3 = 2+\sqrt{5} > 2$.

**Inductive Hypothesis:** Suppose that $F_{k+2} \geq \phi^k$ up to some $k \in \mathbb{N}$.

**Claim:** $F_{k+3} \geq \phi^{k+1}$

$$
\begin{align*}
F_{k+3} &= F_{k+2} + F_{k+1} \\
        &> \phi^k +\phi^{k-1} \\
        &= \phi^{k-1}(\phi + 1) \\
        &= \phi^{k-1} \cdot  \phi^2 \\
        &= \phi^{k+1} \\
\end{align*}
$$
