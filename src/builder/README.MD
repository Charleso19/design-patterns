# Builder Pattern

### Builder pattern notes:
- Good for construction of objects that may contain a lot of parameters. 
- Good for when we want to make the object immutable, once we’re done constructing it.

![image](https://user-images.githubusercontent.com/50376349/182037357-883821cc-2122-4c84-b68d-a7e928d50c63.png)



![image](https://user-images.githubusercontent.com/50376349/182037361-1d07227c-6bde-413e-8461-816a9d4b8edf.png)

- Telescoping constructors are constructors that deal with each parameter variation and default values: https://www.vojtechruzicka.com/avoid-telescoping-constructor-pattern/#:~:text=As%20a%20workaround%2C%20a%20technique,values%20for%20the%20extra%20parameters.
- Telescoping constructors are immutable but is inflexible.
- JavaBean convention is more flexible, but it is mutable via the setters! It is also unclear what the contract should be for valid construction.

![image](https://user-images.githubusercontent.com/50376349/182037366-b018f174-ee30-4257-ba70-4cf1f8b18505.png)

- Not suitable if you want an object that is mutable.
- Typically used with inner static class, but can use an external builder too (https://gist.github.com/vojtechruz/3162a7e5525d242e50935e93149208a1)
- Not typically refactored in after the fact, it is typically designed first.
- Can be a bit involved to implement as it can be achieved with constructors via telescoping constructors.

![image](https://user-images.githubusercontent.com/50376349/182037348-d918ca95-abbc-4b66-a40e-e9d9b2970434.png)




See also:
- https://www.vojtechruzicka.com/avoid-telescoping-constructor-pattern/#:~:text=As%20a%20workaround%2C%20a%20technique,values%20for%20the%20extra%20parameters.
