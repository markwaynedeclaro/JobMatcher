# JobMatcher
REST API that consumes API of Workers and available Jobs then returns a list of Jobs appropriate for the Worker Object

- The Worker should have all required certificates for the Job
- Sort (descending) according to: 
  - Salary
  - The number of matched certificates (But it's unlikely to have two jobs with the same rate, but still, this is nice to have)
- Limit the output to 3 Jobs only
