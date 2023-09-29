Create a PGR model with the following fields:
- id (int)
- name (string)
- address (string)
- phone (string)
- grievance (string)
  -dateofsubmission (Date)

Create a REST API endpoint for the PGR model that allows for the following operations:
- POST /grievance - Create a new grievance
  Data Validations:
- name cannot be empty
- address cannot be empty
- grievance cannot be empty
- dateofsubmission should be today’s date