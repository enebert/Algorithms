For all that follows, let $f(n)$ be some arbitrary function.

**Lower Bound:** The $\Omega$ notation specifies a *lower bound* on the asymptotic behavior of $f(n)$. That is the function $f$ grows at least as fast as its lower bound. The function $f(n)$ is $\Omega(g)$ if there exists a $c$ such that $c g(n) \leq f(n)$ for $n \gg 0$.

**Upper Bound:** The Big-$O$ notation specifies an *upper bound* on the asymptotic behavior of $f(n)$. We say that $f(n)$ is $O(g)$ if there exists some constant $c$ such that $f(n) \leq c g(n)$ for $n \gg 0$.

**Tight Bound:** One says that $f(n)$ is $\Theta(g)$ if there exist two constants $c$ and $\tilde{c}$ (not necessarily the same) such that

$$
c \cdot g(n) \leq f(n) \leq \tilde{c} \cdot g(n) \text{ for } n \gg 0
$$

A way to restate this is to say that $f(n)$ is $\Theta(g)$ if $f(n)$ is both $O(g)$ and $\Omega(g)$.

**Little $o$:** Ones that $f(n)$ is "little-o" of $g(n)$ or $o(g(n))$ if

$$
 o(g(n)) = \{f(n) \mid \forall \, c \in \mathbb{R} \, \exists n_0 \in \mathbb{N} \text{ s.t. } 0 \leq f(n) \leq cg(n) \, \forall \n \geq n_0. \}
$$

* Most number theory books I've read simply use the following limit as a definition

$$
\lim_{n \to \infinity} \frac{f(n)}{g(n)} = 0.
$$

* In some sense, if $f(n)$ is $g(n)$ then $g$ dominates $f$ for the vast majority of $n$.
* $f(n)$ is $o(1)$ if $\lim_{n \to \infity} f(n) = 0$; or put another way, for large $n$ the function $f$ becomes negligible.
