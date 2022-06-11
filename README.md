## Toxic Feedback BE


### What is Toxic Feedback?

This app allows you to send feedback and see previous feedback from users. also, you can see the feedback has a toxicity score. Toxicity scores are a number between 0 and 100. 0 is the least toxic and 100 is the most toxic. App has 7 categories of toxicity. 

The backend has a 2 version. I started with Postgres and then switched to MongoDB.

On the api we basicly have 3 endpoints. 
- /health - returns 200 if the app is running.
- /addFeedback - adds a feedback to the database.
- /feedbacks - returns all feedbacks from the database.


### Technologies Used

- [Frontend](https://github.com/cenarturkmen/toxic-feedback-be) --> React, Tailwind, Material UI, and TensorFlowJS.

- Backend --> Java, SpringBoot and MongoDB.

### Deployments
You can check the backend [here](https://toxic-feedback.herokuapp.com/).


### Todo List
- [ ]  Add unit tests
- [ ]  Find a better provider than heroku. Cause heroku is not so fast.