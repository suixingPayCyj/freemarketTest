My name is :${username}
I'm a :${sex}
I'm ${age} years old.

<#macro repeat count> 
<#list 1..count as x> 
<#nested x, x/2, x==count> 
</#list> 
</#macro> 
<@repeat count=4; c, halfc, last> 