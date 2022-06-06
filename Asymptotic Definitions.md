For all that follows, let $f(n)$ be some arbitrary function.

**Lower Bound:** The $\Omega$ notation specifies a *lower bound* on the asymptotic behavior of $f(n)$. That is the function $f$ grows at least as fast as its lower bound. The function $f(n)$ is $\Omega(g)$ if there exists a $c$ such that $c g(n) \leq f(n)$ for $n \gg 0$.

**Upper Bound:** The Big-$O$ notation specifies an *upper bound* on the asymptotic behavior of $f(n)$. We say that $f(n)$ is $O(g)$ if there exists some constant $c$ such that $f(n) \leq c g(n)$ for $n \gg 0$.

**Tight Bound:** One says that $f(n)$ is $\Theta(g)$ if there exist two constants $c$ and $\tilde{c}$ (not necessarily the same) such that

$$
c \cdot g(n) \leq f(n) \leq \tilde{c} \cdot g(n) \text{ for } n \gg 0
$$

A way to restate this is to say that $f(n)$ is $\Theta(g)$ if $f(n)$ is both $O(g)$ and $\Omega(g)$.
