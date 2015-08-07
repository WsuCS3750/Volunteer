

-- Create the simple volunteer table


use volunteer;
go;
CREATE TABLE UserTable
(
  user_id INT PRIMARY KEY NOT NULL IDENTITY,
  firstName VARCHAR(50) NOT NULL,
  lastName VARCHAR(50) NOT NULL,
  userName VARCHAR(50) NOT NULL,
  password VARCHAR(200) NOT NULL,
  adminStatus VARCHAR(3) NOT NULL default 'n',
  joinDate SMALLDATETIME DEFAULT getdate()  NOT NULL,
  modifiedOn TIMESTAMP NOT NULL,

);

