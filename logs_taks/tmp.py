errors = []
i = 0

with open('/home/aravinda/Desktop/Task/logs/application.log') as log_file:
    for line in log_file:
        line_parts = line.split(" ")
        if len(line_parts) > 2:
            if line_parts[2] == 'ERROR':
                print(line_parts[2])
                i += 1
                error_split = line.split("ERROR")
                print(error_split[1])
                if error_split[1] not in errors:
                    errors.append(error_split[1])

print('TOTAL ERRORS:' + str(i))
print('UNIQUE ERRORS:' + str(len(errors)))
