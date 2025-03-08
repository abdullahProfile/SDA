# SDA

<h1>With Principle (Good Design)</h1>

<ul>
<li>Stores weights in an array.</li>
<li>Adds weights using addWeight().</li>
<li>Uses getWeight(int i) to access data instead of direct array access.</li>
<li>getTotalWeight() calls getWeight() instead of reading array values directly.</li>
<li>Fix: Follows Information Expert, as getWeight() manages weight retrieval, making the design more maintainable.</li>
</ul>
