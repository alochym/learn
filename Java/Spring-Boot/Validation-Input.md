# Validation Input

1. **It is a `spring-boot-stater-validation` artifactId**.
1. **Should be applied to [POJO](POJO.md)**.
1. ***Should be used in `Controller` with `@Valid` annotation***.
1. `@NotBlank`
    1. Cannot be NULL.
    1. Must contains at least one non-whitespace character.
1. `@Min` - Cannot be less than the minimum.
1. `@Max` - Cannot exceed the maximum.
1. `@NotEmpty`
    1. Cannot be NULL.
    1. Cannot not be empty.
1. `@Email` - Well form email address.
1. `@Size` - Size must be between the specified boundaries.
1. `@AssertTrue` - Must equal True.
1. `@Past` - Property is the past.
1. `@Future` - Property is the future.
