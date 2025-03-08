# SDA

<h1>With Principle (Good Design)</h1>

<ul>
<li>Stores weights in an array.</li>
<li>Adds weights using addWeight().</li>
<li>Uses getWeight(int i) to access data instead of direct array access.</li>
<li>getTotalWeight() calls getWeight() instead of reading array values directly.</li>
<li>Fix: Follows Information Expert, as getWeight() manages weight retrieval, making the design more maintainable.</li>
</ul>

<br>
<h2>With out Principle (Bad Design)</h2>

<ul>
<li>Stores weights in an array.</li>
<li>Adds weights using addWeight().</li>
<li>UCalculates total weight using getTotalWeight(), directly accessing the array.</li>
<li>getTotalWeight() calls getWeight() instead of reading array values directly.</li>
<li>Issue: Breaks Information Expert because getTotalWeight() directly reads the array instead of using a method.</li>
</ul>

<br>

<h3>Conclusion</h3>

<p>
The WithoutPrinciple code directly accesses data, making it less maintainable. The WithPrinciple code applies the Information Expert principle by using a method (getWeight()) to control data access, improving encapsulation and maintainability.
</p>