# CountriesApi
## Prerequisites
- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Postman](https://www.postman.com/downloads/)

## Running the Application

1. Open Eclipse IDE.
2. Navigate to `src/main/java`.
3. Right-click on `com.advaitFoundation.countriesApi.CountriesApiApplication`.
4. Choose "Run As" > "Java Application."

## Username : advait
   password : advait
   click on authentication -> basic auth -> then fill this username and password before hitting any api.

## Accessing APIs

### 1. Get List of All Countries

- **Method:** GET
- **URL:** http://localhost:8080/api/country/all
- **Authentication:** Basic Auth (Username and Password required)

### 2. Get Information for a Specific Country

- **Method:** GET
- **URL:** http://localhost:8080/api/country/info/{country-name}
- **Example:** http://localhost:8080/api/country/info/india
- **Authentication:** Basic Auth (Username and Password required)

### 3. Get Filtered List of Countries

- **Method:** GET
- **URL:** http://localhost:8080/api/country/filtered
- **Query Parameters:**
  - `filter` (e.g., population, area, language)
  - `value` (e.g., 100000000, 500000, english)
  - `sort` (e.g., asc, desc)
  - `page` (e.g., 1)
  - `size` (e.g., 10)
- **Example:** http://localhost:8080/api/country/filtered?filter=population&value=100000000&sort=asc&page=1&size=10
- **Authentication:** Basic Auth (Username and Password required)

