

-- Create the simple volunteer table

use volunteer;
go
CREATE TABLE Volunteer
(
	VolunteerID			int		NOT NULL	IDENTITY(1, 1),
	VolunteerFirstName	varchar(25)		NOT NULL,
	VolunteerLastName	varchar(30)		NOT NULL,
	VolunteerDoB		smalldatetime	NOT NULL
)

ALTER TABLE VOLUNTEER
	ADD CONSTRAINT PK_VolunteerID
	PRIMARY KEY (VolunteerID)

;
